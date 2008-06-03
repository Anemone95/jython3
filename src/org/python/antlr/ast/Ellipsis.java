// Autogenerated AST node
package org.python.antlr.ast;
import org.python.antlr.PythonTree;
import org.antlr.runtime.CommonToken;
import org.antlr.runtime.Token;
import java.io.DataOutputStream;
import java.io.IOException;

public class Ellipsis extends sliceType {

    public static final String[] _fields = new String[] {};

    public Ellipsis(Token token) {
        super(token);
    }

    public Ellipsis(int ttype, Token token) {
        super(ttype, token);
    }

    public Ellipsis(PythonTree tree) {
        super(tree);
    }

    public String toString() {
        return "Ellipsis";
    }

    public <R> R accept(VisitorIF<R> visitor) throws Exception {
        return visitor.visitEllipsis(this);
    }

    public void traverse(VisitorIF visitor) throws Exception {
    }

}
