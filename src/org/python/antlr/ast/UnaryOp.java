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

@ExposedType(name = "_ast.UnaryOp", base = expr.class)
public class UnaryOp extends expr {
public static final PyType TYPE = PyType.fromClass(UnaryOp.class);
    private unaryopType op;
    public unaryopType getInternalOp() {
        return op;
    }
    @ExposedGet(name = "op")
    public PyObject getOp() {
        return AstAdapters.unaryop2py(op);
    }
    @ExposedSet(name = "op")
    public void setOp(PyObject op) {
        this.op = AstAdapters.py2unaryop(op);
    }

    private expr operand;
    public expr getInternalOperand() {
        return operand;
    }
    @ExposedGet(name = "operand")
    public PyObject getOperand() {
        return operand;
    }
    @ExposedSet(name = "operand")
    public void setOperand(PyObject operand) {
        this.operand = AstAdapters.py2expr(operand);
    }


    private final static PyUnicode[] fields =
    new PyUnicode[] {new PyUnicode("op"), new PyUnicode("operand")};
    @ExposedGet(name = "_fields")
    public PyUnicode[] get_fields() { return fields; }

    private final static PyUnicode[] attributes =
    new PyUnicode[] {new PyUnicode("lineno"), new PyUnicode("col_offset")};
    @ExposedGet(name = "_attributes")
    public PyUnicode[] get_attributes() { return attributes; }

    public UnaryOp(PyType subType) {
        super(subType);
    }
    public UnaryOp() {
        this(TYPE);
    }
    @ExposedNew
    @ExposedMethod
    public void UnaryOp___init__(PyObject[] args, String[] keywords) {
        ArgParser ap = new ArgParser("UnaryOp", args, keywords, new String[]
            {"op", "operand", "lineno", "col_offset"}, 2, true);
        setOp(ap.getPyObject(0, Py.None));
        setOperand(ap.getPyObject(1, Py.None));
        int lin = ap.getInt(2, -1);
        if (lin != -1) {
            setLineno(lin);
        }

        int col = ap.getInt(3, -1);
        if (col != -1) {
            setLineno(col);
        }

    }

    public UnaryOp(PyObject op, PyObject operand) {
        setOp(op);
        setOperand(operand);
    }

    public UnaryOp(Token token, unaryopType op, expr operand) {
        super(token);
        this.op = op;
        this.operand = operand;
        addChild(operand);
    }

    public UnaryOp(Integer ttype, Token token, unaryopType op, expr operand) {
        super(ttype, token);
        this.op = op;
        this.operand = operand;
        addChild(operand);
    }

    public UnaryOp(PythonTree tree, unaryopType op, expr operand) {
        super(tree);
        this.op = op;
        this.operand = operand;
        addChild(operand);
    }

    @ExposedGet(name = "repr")
    public String toString() {
        return "UnaryOp";
    }

    public String toStringTree() {
        StringBuffer sb = new StringBuffer("UnaryOp(");
        sb.append("op=");
        sb.append(dumpThis(op));
        sb.append(",");
        sb.append("operand=");
        sb.append(dumpThis(operand));
        sb.append(",");
        sb.append(")");
        return sb.toString();
    }

    public <R> R accept(VisitorIF<R> visitor) throws Exception {
        return visitor.visitUnaryOp(this);
    }

    public void traverse(VisitorIF<?> visitor) throws Exception {
        if (operand != null)
            operand.accept(visitor);
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
