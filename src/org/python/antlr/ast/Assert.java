// Autogenerated AST node
package org.python.antlr.ast;
import org.python.antlr.PythonTree;
import org.antlr.runtime.CommonToken;
import org.antlr.runtime.Token;
import java.io.DataOutputStream;
import java.io.IOException;

public class Assert extends stmtType {
    public exprType test;
    public exprType msg;

    public static final String[] _fields = new String[] {"test","msg"};

    public Assert(Token token, exprType test, exprType msg) {
        super(token);
        this.test = test;
        this.msg = msg;
    }

    public Assert(int ttype, Token token, exprType test, exprType msg) {
        super(ttype, token);
        this.test = test;
        this.msg = msg;
    }

    public Assert(PythonTree tree, exprType test, exprType msg) {
        super(tree);
        this.test = test;
        this.msg = msg;
    }

    public String toString() {
        return "Assert";
    }

    public <R> R accept(VisitorIF<R> visitor) throws Exception {
        return visitor.visitAssert(this);
    }

    public void traverse(VisitorIF visitor) throws Exception {
        if (test != null)
            test.accept(visitor);
        if (msg != null)
            msg.accept(visitor);
    }

    public int getLineno() {
        return getLine();
    }

    public int getCol_offset() {
        return getCharPositionInLine();
    }

}
