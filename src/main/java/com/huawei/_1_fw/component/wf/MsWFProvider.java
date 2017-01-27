package com.huawei._1_fw.component.wf;

import com.huawei._1_fw.core.ioc.IOCUtils;

/**
 * MsWFProvider<br>
 * 工作流框架：工作流提供的工具类<br>
 * 
 * @author JHercules
 *
 */
public class MsWFProvider {
	// #region fireStep

	public static <T extends IMsWFStep> void fireStep(Class<T> oClassStep, Object oLastStepContext) {
		T oStep = IOCUtils.getInstance().getBean(oClassStep);
		if (oStep.canRun(oLastStepContext)) {
			oStep.run(oLastStepContext);
		}
	}

	// #endregion
}
