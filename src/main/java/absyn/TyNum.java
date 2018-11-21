package absyn;

import env.Env;
import io.vavr.collection.Tree;
import types.INT;
import types.Type;

import env.Env;
import io.vavr.collection.Tree;
import types.NUM;
import types.Type;

public class TyNum extends Ty {

    public TyNum(Loc loc) {
        super(loc);
    }

    @java.lang.Override
    public Tree.Node<String> toTree() {
        return Tree.of("num");
    }

    @Override
    public Type semantic(Env env) {
        return NUM.T;
    }
}

