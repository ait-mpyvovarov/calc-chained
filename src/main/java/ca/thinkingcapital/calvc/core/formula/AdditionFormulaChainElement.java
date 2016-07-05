/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.thinkingcapital.calvc.core.formula;

import ca.thinkingcapital.calvc.core.input.CalcRequest;
import ca.thinkingcapital.calvc.core.input.CalcRequestNum3;
import ca.thinkingcapital.calvc.core.output.CalcResponse;

/**
 *
 * @author MPyvovarov
 */
public class AdditionFormulaChainElement extends AbstractFormulaChainElement{

    @Override
    public CalcResponse execute(CalcRequest request) {
        CalcRequestNum3 calcRequestNum3 = new CalcRequestNum3();
        calcRequestNum3.setNum3(request.getNum1()+request.getNum2());
        if(this.getNextFormulaChain()!=null){
            return this.getNextFormulaChain().execute(calcRequestNum3);
        } else {
            return new CalcResponse();
        }
    }
    
}
