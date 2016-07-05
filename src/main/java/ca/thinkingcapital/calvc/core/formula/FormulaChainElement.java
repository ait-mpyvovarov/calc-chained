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
 * @param <I>
 * @param <O>
 */
public interface FormulaChainElement<I extends CalcRequest,O extends CalcResponse> {
    O execute(I request);
}
