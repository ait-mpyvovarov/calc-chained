/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.thinkingcapital.calvc.core.formula;

import ca.thinkingcapital.calvc.core.input.CalcRequest;
import ca.thinkingcapital.calvc.core.output.CalcResponse;

/**
 *
 * @author MPyvovarov
 */
public abstract class AbstractFormulaChainElement implements FormulaChainElement<CalcRequest, CalcResponse>{
    private FormulaChainElement<CalcRequest, CalcResponse> nextFormulaChain;

    public FormulaChainElement<CalcRequest, CalcResponse> getNextFormulaChain() {
        return nextFormulaChain;
    }

    public void setNextFormulaChain(FormulaChainElement<CalcRequest, CalcResponse> nextFormulaChain) {
        this.nextFormulaChain = nextFormulaChain;
    }

    
    
}
