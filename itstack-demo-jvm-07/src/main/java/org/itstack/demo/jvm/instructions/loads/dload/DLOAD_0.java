package org.itstack.demo.jvm.instructions.loads.dload;

import org.itstack.demo.jvm.instructions.base.InstructionNoOperands;
import org.itstack.demo.jvm.rtda.Frame;

public class DLOAD_0 extends InstructionNoOperands {

    @Override
    public void execute(Frame frame) {
        double val = frame.localVars().getDouble(0);
        frame.operandStack().pushDouble(val);
    }

}