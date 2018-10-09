/*
MIT License

Copyright (c) 2018 Gustavo Moitinho Trindade

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.
*/
package com.github.trindadegm.siwump.world;

public class Cave
{
  public static class Properties
  {
    private boolean smell;
    private boolean breeze;
    private boolean shine;
    private boolean exit;

    public Properties()
    {
      smell = breeze = shine = exit = false;
    }

    public Properties(boolean givenSmell, boolean givenBreeze,
                      boolean givenShine, boolean givenExit)
    {
      smell = givenSmell;
      breeze = givenBreeze;
      shine = givenShine;
      exit = givenExit;
    }

    @Override
    public Properties clone()
    {
      return new Properties(smell, breeze, shine, exit);
    }

    public boolean hasSmell()
    {
      return smell;
    }

    public boolean hasBreeze()
    {
      return breeze;
    }

    public boolean hasShine()
    {
      return shine;
    }

    public boolean hasExit()
    {
      return exit;
    }

    public void setSmell(boolean givenSmell)
    {
      smell = givenSmell;
    }

    public void setBreeze(boolean givenBreeze)
    {
      breeze = givenBreeze;
    }

    public void setShine(boolean givenShine)
    {
      shine = givenShine;
    }

    public void setExit(boolean givenExit)
    {
      exit = givenExit;
    }

    @Override
    public String toString()
    {
      return String.format("[SMELL:%b; BREEZE:%b; SHINE:%b; EXIT:%b]", smell,
                            breeze, shine, exit);
    }
  } // End of nested class Properties

  private Properties properties;
  private int x;
  private int y;

  public Cave()
  {
    properties = new Properties();
    x = y = 0;
  }

  public Cave(Properties givenProperties, int givenX, int givenY)
  {
    setProperties(givenProperties);
    setX(givenX);
    setY(givenY);
  }

  public Properties getProperties()
  {
    return properties.clone();
  }

  public void setProperties(Properties givenProperties)
  {
    properties = givenProperties.clone();
  }

  public void setPos(int givenX, int givenY)
  {
    setX(givenX);
    setY(givenY);
  }

  public int getX()
  {
    return x;
  }

  public int getY()
  {
    return y;
  }

  public void setX(int givenX)
  {
    x = givenX;
  }

  public void setY(int givenY)
  {
    y = givenY;
  }

  @Override
  public String toString()
  {
    return String.format(properties + " (%d, %d)", x, y);
  }
}
