/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.thinkingcapital.calvc.core.ws;

import ca.thinkingcapital.calvc.core.FormulaChainBuilder;
import ca.thinkingcapital.calvc.core.formula.FormulaChainElement;
import ca.thinkingcapital.calvc.core.input.CalcRequest;
import ca.thinkingcapital.calvc.core.output.CalcResponse;

/**
 *
 * @author MPyvovarov
 */
public class CalcWSImpl implements CalcWS {
    
    private FormulaChainBuilder formulaChainBuilder;

    public FormulaChainBuilder getFormulaChainBuilder() {
        return formulaChainBuilder;
    }

    public void setFormulaChainBuilder(FormulaChainBuilder formulaChainBuilder) {
        this.formulaChainBuilder = formulaChainBuilder;
    }
    
    @Override
    public CalcResponse calculate(CalcRequest req) {
        FormulaChainElement formulaChainElement = 
                this.getFormulaChainBuilder().build(req.getType());
        return formulaChainElement.execute(req);
    }
    
}
