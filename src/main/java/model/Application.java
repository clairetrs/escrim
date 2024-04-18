package model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Application {
  private static Application instance = null;
  
  public static Application getInstance() {
    if (instance == null) {
      instance = new Application();
    }
    return instance;
  }

  public Application() {
  }


  @Override
  public String toString() {
    return "Application []";
  }

  public static void main(String[] args) {
  }

}
