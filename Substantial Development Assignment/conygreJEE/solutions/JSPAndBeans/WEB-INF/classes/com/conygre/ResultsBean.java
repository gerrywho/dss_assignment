package com.conygre;

public class ResultsBean  {

	private String[] delegateAnswers = new String[8];
	private static String[] correctAnswers = { "a", "d", "a", "c", "c", "false", "c", "b" };
	private int delegateTotal=0;

	private int counter = 0;

	public void setDelegateAnswers(String[] s)
	{
		delegateAnswers = s;
	}


	public int getDelegateTotal()
	{
		delegateTotal=0;
		for (int i=0;i<correctAnswers.length;i++)
		{
			if (delegateAnswers[i] == null)  {
				continue;
			}
			else if (delegateAnswers[i].equals(correctAnswers[i])) {
				delegateTotal++;
			}
		}
		System.out.println(delegateTotal);
		return delegateTotal;
	}

}