package absyn;

import env.Env;
import io.vavr.collection.Tree;
import types.NUM;
import types.Type;

public class ExpNum extends Exp {

    public final double value;

    public ExpNum(Loc loc, String value) {
        super(loc);
        this.value = new Double(value);
    }

    @Override
    public Tree.Node<String> toTree() {
        return Tree.of(annotateType("ExpNum: " + value));
    }

    @Override
    protected Type semantic_(Env env) {
        return NUM.T;
    }

}

