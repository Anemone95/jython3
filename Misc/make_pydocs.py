import io
import types
import re

def print_doc(out, obj, meth):
    if meth == '__doc__':
        doc = getattr(obj, meth)
        bdname = '%s_doc' % obj.__name__
    else:
        if meth == '__abstractmethods__':
            # getattr(type,'__abstractmethods__') would fail
            doc = ""
        else:
            doc = getattr(obj, meth).__doc__
        bdname = '%s_%s_doc' % (obj.__name__, meth)

    if doc is None:
        doc = ""
    if not isinstance(doc, str):
        print(obj, meth)
    lines = doc.split("\n")
    outstring = '\\n" + \n        "'.join(format(line) for line in lines)
    print('    public final static String %s = ' % bdname, file=out)
    print('        "%s";\n' % outstring, file=outfile)

format = lambda line: line.replace('\\', '\\\\').replace('"', r'\"')

types_list = [
object,
type,
bytes,
dict,
list,
slice,
super,
staticmethod,
float,
enumerate,
int,
tuple,
str,
property,
range,
complex,
bool,
classmethod,
set,
frozenset,
BaseException,
bytearray,
memoryview,
types.GeneratorType,
types.CoroutineType,
types.FunctionType,
#types.MemberDescriptorType,
types.CodeType,
types.SimpleNamespace,
types.FrameType,
types.TracebackType,
type(re.compile("f")),
type(re.compile("f").match("f")),
io.TextIOBase
]

outfile = open("BuiltinDocs.java", "w")
print('// generated by make_pydocs.py\n', file=outfile)
print('package org.python.core;\n', file=outfile)
print('public class BuiltinDocs {\n', file=outfile)


for obj in types_list: 
    print('    // Docs for %s' % obj, file=outfile)
    for meth in dir(obj):
        print_doc(outfile, obj, meth)

print('}', file=outfile)
