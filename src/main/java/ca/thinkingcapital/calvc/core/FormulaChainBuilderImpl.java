/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.thinkingcapital.calvc.core;

import ca.thinkingcapital.calvc.core.formula.MultFormulaChainElement;
import ca.thinkingcapital.calvc.core.formula.FormulaChainElement;
import ca.thinkingcapital.calvc.core.formula.AdditionFormulaChainElement;

/**
 *
 * @author MPyvovarov
 */
public class FormulaChainBuilderImpl implements FormulaChainBuilder{

    private FormulaChainElement buildMca(){
        AdditionFormulaChainElement additionFormulaChain = new AdditionFormulaChainElement();
        MultFormulaChainElement mult = new MultFormulaChainElement();
        additionFormulaChain.setNextFormulaChain(mult);
        mult.setNextFormulaChain(additionFormulaChain);
        return additionFormulaChain;
    }
    
    
    @Override
    public FormulaChainElement build(ProductType type) {
        switch(type){
            case MCA : return buildMca();
            default: return null;
        }
    }
    
}

