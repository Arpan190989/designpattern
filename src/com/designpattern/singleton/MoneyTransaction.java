package com.designpattern.singleton;

import com.designpattern.constants.DesignPatternConstants;

public class MoneyTransaction implements Cloneable {

	private static MoneyTransaction tran = new MoneyTransaction();

	public static final String name = DesignPatternConstants.MONEY_TRANSACTION;

	private MoneyTransaction() {

	}

	public synchronized static MoneyTransaction getInstance() {
		return tran;
	}

	protected MoneyTransaction readResolve() {
		return tran;
	}

	/*
	 * Either we can throw a clone not supported Exception or return the same
	 * instance Depends on the usecase
	 */
	@Override
	public Object clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException(DesignPatternConstants.CLONE_EXCEPTION);
	}

}