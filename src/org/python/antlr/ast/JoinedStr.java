// Autogenerated AST node
package org.python.antlr.ast;
import org.antlr.runtime.CommonToken;
import org.antlr.runtime.Token;
import org.python.antlr.AST;
import org.python.antlr.PythonTree;
import org.python.antlr.adapter.AstAdapters;
import org.python.antlr.base.excepthandler;
import org.python.antlr.base.expr;
import org.python.antlr.base.mod;
import org.python.antlr.base.slice;
import org.python.antlr.base.stmt;
import org.python.core.ArgParser;
import org.python.core.AstList;
import org.python.core.Py;
import org.python.core.PyObject;
import org.python.core.PyString;
import org.python.core.PyUnicode;
import org.python.core.PyStringMap;
import org.python.core.PyType;
import org.python.core.Visitproc;
import org.python.expose.ExposedGet;
import org.python.expose.ExposedMethod;
import org.python.expose.ExposedNew;
import org.python.expose.ExposedSet;
import org.python.expose.ExposedType;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.ArrayList;

@ExposedType(name = "_ast.JoinedStr", base = expr.class)
public class JoinedStr extends expr {
public static final PyType TYPE = PyType.fromClass(JoinedStr.class);
    private java.util.List<expr> values;
    public java.util.List<expr> getInternalValues() {
        return values;
    }
    @ExposedGet(name = "values")
    public PyObject getValues() {
        return new AstList(values, AstAdapters.exprAdapter);
    }
    @ExposedSet(name = "values")
    public void setValues(PyObject values) {
        this.values = AstAdapters.py2exprList(values);
    }


    private final static PyUnicode[] fields =
    new PyUnicode[] {new PyUnicode("values")};
    @ExposedGet(name = "_fields")
    public PyUnicode[] get_fields() { return fields; }

    private final static PyUnicode[] attributes =
    new PyUnicode[] {new PyUnicode("lineno"), new PyUnicode("col_offset")};
    @ExposedGet(name = "_attributes")
    public PyUnicode[] get_attributes() { return attributes; }

    public JoinedStr(PyType subType) {
        super(subType);
    }
    public JoinedStr() {
        this(TYPE);
    }
    @ExposedNew
    @ExposedMethod
    public void JoinedStr___init__(PyObject[] args, String[] keywords) {
        ArgParser ap = new ArgParser("JoinedStr", args, keywords, new String[]
            {"values", "lineno", "col_offset"}, 1, true);
        setValues(ap.getPyObject(0, Py.None));
        int lin = ap.getInt(1, -1);
        if (lin != -1) {
            setLineno(lin);
        }

        int col = ap.getInt(2, -1);
        if (col != -1) {
            setLineno(col);
        }

    }

    public JoinedStr(PyObject values) {
        setValues(values);
    }

    public JoinedStr(Token token, java.util.List<expr> values) {
        super(token);
        this.values = values;
        if (values == null) {
            this.values = new ArrayList<expr>();
        }
        for(PythonTree t : this.values) {
            addChild(t);
        }
    }

    public JoinedStr(Integer ttype, Token token, java.util.List<expr> values) {
        super(ttype, token);
        this.values = values;
        if (values == null) {
            this.values = new ArrayList<expr>();
        }
        for(PythonTree t : this.values) {
            addChild(t);
        }
    }

    public JoinedStr(PythonTree tree, java.util.List<expr> values) {
        super(tree);
        this.values = values;
        if (values == null) {
            this.values = new ArrayList<expr>();
        }
        for(PythonTree t : this.values) {
            addChild(t);
        }
    }

    @ExposedGet(name = "repr")
    public String toString() {
        return "JoinedStr";
    }

    public String toStringTree() {
        StringBuffer sb = new StringBuffer("JoinedStr(");
        sb.append("values=");
        sb.append(dumpThis(values));
        sb.append(",");
        sb.append(")");
        return sb.toString();
    }

    public <R> R accept(VisitorIF<R> visitor) throws Exception {
        return visitor.visitJoinedStr(this);
    }

    public void traverse(VisitorIF<?> visitor) throws Exception {
        if (values != null) {
            for (PythonTree t : values) {
                if (t != null)
                    t.accept(visitor);
            }
        }
    }

    public PyObject __dict__;

    @Override
    public PyObject fastGetDict() {
        ensureDict();
        return __dict__;
    }

    @ExposedGet(name = "__dict__")
    public PyObject getDict() {
        return fastGetDict();
    }

    private void ensureDict() {
        if (__dict__ == null) {
            __dict__ = new PyStringMap();
        }
    }

    private int lineno = -1;
    @ExposedGet(name = "lineno")
    public int getLineno() {
        if (lineno != -1) {
            return lineno;
        }
        return getLine();
    }

    @ExposedSet(name = "lineno")
    public void setLineno(int num) {
        lineno = num;
    }

    private int col_offset = -1;
    @ExposedGet(name = "col_offset")
    public int getCol_offset() {
        if (col_offset != -1) {
            return col_offset;
        }
        return getCharPositionInLine();
    }

    @ExposedSet(name = "col_offset")
    public void setCol_offset(int num) {
        col_offset = num;
    }

}
