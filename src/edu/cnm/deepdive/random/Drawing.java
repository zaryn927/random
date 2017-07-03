/**
 * 
 */
package edu.cnm.deepdive.random;

import java.util.Random;

/**
 * @author Sky Link
 *
 */
abstract class Drawing {
  
  private Random rng;
  
  /**
   * 
   */
  protected Drawing() {
    this(new Random());
  }
  
  /**
   * 
   * @param rng
   */
  protected Drawing(Random rng) {
    super();
    this.rng = rng;
  }
  
  /**
   * 
   */
  public abstract void shuffle();
  
  /**
   * 
   * @param numItems
   * @return
   */
  public abstract Integer[] draw(int numItems);

  /**
   * @return the rng
   */
  protected Random getRng() {
    return rng;
  }

  /**
   * @param rng the rng to set
   */
  protected void setRng(Random rng) {
    this.rng = rng;
  }
}
