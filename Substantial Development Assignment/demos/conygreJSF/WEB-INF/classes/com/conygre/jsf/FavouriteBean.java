package com.conygre.jsf;

public class FavouriteBean{

    String favouriteColour;
    String[] colours;
    String defaultColour;
    private int favouriteNumber;

    public FavouriteBean()
    {
			String[] colourArray = {"red", "green", "blue", "pink", "purple", "black", "white", "yellow", "grey"};
			colours = colourArray;
		}

    public void setFavouriteColour(String colour) {
        favouriteColour = colour;
        System.out.println("Set favourite colour " + favouriteColour);
    }

    public String getFavouriteColour() {
        System.out.println("get favourite colour" + favouriteColour);
        return favouriteColour;
    }

    public String getDefaultColour()
    {
			if (favouriteColour == null) return defaultColour;
			else return favouriteColour;
		}

		public void setDefaultColour(String def)
		{
			defaultColour = def;
		}

		public void setFavouriteNumber(int newNumber)
		{
			favouriteNumber = newNumber;
		}

		public int getFavouriteNumber()
		{
			return favouriteNumber;
		}

}
