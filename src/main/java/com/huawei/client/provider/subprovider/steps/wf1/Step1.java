package com.huawei.client.provider.subprovider.steps.wf1;

import org.springframework.stereotype.Component;

import com.huawei._1_fw.component.wf.IMsWFStep;

@Component
public class Step1 implements IMsWFStep {
	// #region canRun

	@Override
	public boolean canRun(Object oLastStepContext) {
		// ����ҵ���߼�ʵ��
		return true;
	}

	// #endregion

	// #region run

	@Override
	public void run(Object oLastStepContext) {
		// ����������ִ����Ӧҵ���߼�
		if (null != oLastStepContext) {
			System.out.println("step1_case1...");
		} else {
			System.out.println("step1_case2...");
		}
	}

	// #endregion
}
