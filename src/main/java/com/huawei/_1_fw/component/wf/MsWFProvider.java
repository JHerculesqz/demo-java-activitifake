package com.huawei._1_fw.component.wf;

import com.huawei._1_fw.core.ioc.IOCUtils;

/**
 * MsWFProvider<br>
 * ��������ܣ��������ṩ�Ĺ�����<br>
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
