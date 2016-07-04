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

@ExposedType(name = "_ast.Tuple", base = expr.class)
public class Tuple extends expr implements Context {
public static final PyType TYPE = PyType.fromClass(Tuple.class);
    private java.util.List<expr> elts;
    public java.util.List<expr> getInternalElts() {
        return elts;
    }
    @ExposedGet(name = "elts")
    public PyObject getElts() {
        return new AstList(elts, AstAdapters.exprAdapter);
    }
    @ExposedSet(name = "elts")
    public void setElts(PyObject elts) {
        this.elts = AstAdapters.py2exprList(elts);
    }

    private expr_contextType ctx;
    public expr_contextType getInternalCtx() {
        return ctx;
    }
    @ExposedGet(name = "ctx")
    public PyObject getCtx() {
        return AstAdapters.expr_context2py(ctx);
    }
    @ExposedSet(name = "ctx")
    public void setCtx(PyObject ctx) {
        this.ctx = AstAdapters.py2expr_context(ctx);
    }


    private final static PyUnicode[] fields =
    new PyUnicode[] {new PyUnicode("elts"), new PyUnicode("ctx")};
    @ExposedGet(name = "_fields")
    public PyUnicode[] get_fields() { return fields; }

    private final static PyUnicode[] attributes =
    new PyUnicode[] {new PyUnicode("lineno"), new PyUnicode("col_offset")};
    @ExposedGet(name = "_attributes")
    public PyUnicode[] get_attributes() { return attributes; }

    public Tuple(PyType subType) {
        super(subType);
    }
    public Tuple() {
        this(TYPE);
    }
    @ExposedNew
    @ExposedMethod
    public void Tuple___init__(PyObject[] args, String[] keywords) {
        ArgParser ap = new ArgParser("Tuple", args, keywords, new String[]
            {"elts", "ctx", "lineno", "col_offset"}, 2, true);
        setElts(ap.getPyObject(0, Py.None));
        setCtx(ap.getPyObject(1, Py.None));
        int lin = ap.getInt(2, -1);
        if (lin != -1) {
            setLineno(lin);
        }

        int col = ap.getInt(3, -1);
        if (col != -1) {
            setLineno(col);
        }

    }

    public Tuple(PyObject elts, PyObject ctx) {
        setElts(elts);
        setCtx(ctx);
    }

    public Tuple(Token token, java.util.List<expr> elts, expr_contextType ctx) {
        super(token);
        this.elts = elts;
        if (elts == null) {
            this.elts = new ArrayList<expr>();
        }
        for(PythonTree t : this.elts) {
            addChild(t);
        }
        this.ctx = ctx;
    }

    public Tuple(Integer ttype, Token token, java.util.List<expr> elts, expr_contextType ctx) {
        super(ttype, token);
        this.elts = elts;
        if (elts == null) {
            this.elts = new ArrayList<expr>();
        }
        for(PythonTree t : this.elts) {
            addChild(t);
        }
        this.ctx = ctx;
    }

    public Tuple(PythonTree tree, java.util.List<expr> elts, expr_contextType ctx) {
        super(tree);
        this.elts = elts;
        if (elts == null) {
            this.elts = new ArrayList<expr>();
        }
        for(PythonTree t : this.elts) {
            addChild(t);
        }
        this.ctx = ctx;
    }

    @ExposedGet(name = "repr")
    public String toString() {
        return "Tuple";
    }

    public String toStringTree() {
        StringBuffer sb = new StringBuffer("Tuple(");
        sb.append("elts=");
        sb.append(dumpThis(elts));
        sb.append(",");
        sb.append("ctx=");
        sb.append(dumpThis(ctx));
        sb.append(",");
        sb.append(")");
        return sb.toString();
    }

    public <R> R accept(VisitorIF<R> visitor) throws Exception {
        return visitor.visitTuple(this);
    }

    public void traverse(VisitorIF<?> visitor) throws Exception {
        if (elts != null) {
            for (PythonTree t : elts) {
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

    public void setContext(expr_contextType c) {
        this.ctx = c;
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
