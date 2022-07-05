package com.tugalsan.tst.automodule.api.client;

import com.tugalsan.tst.automodule.parent1.client.*;
import com.tugalsan.tst.automodule.parent2.client.*;

public class TGS_TstAutomoduleApi {

    public static void doSth() {
        TGS_TstAutomoduleParent1.doSth();
        TGS_TstAutomoduleParent2.doSth();
    }
}
