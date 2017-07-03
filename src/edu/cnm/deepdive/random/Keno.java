/**
 * 
 */
package edu.cnm.deepdive.random;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

/**
 * @author Sky Link
 *
 */
public class Keno extends Drawing{
  
  public static final int DEFAULT_POOL_SIZE = 80;
  
  private ArrayList<Integer> pool;
  private boolean shuffled;
  private int position;
  
  /**
   * 
   */
  public Keno() {
    this(DEFAULT_POOL_SIZE);
  }
  
  /**
   * 
   * @param poolSize
   */
  public Keno(int poolSize) {
    this(new Random(), poolSize);
  }
  
  /**
   * 
   * @param rng
   */
  public Keno(Random rng, int poolSize) {
    super(rng);
    pool = new ArrayList<>(poolSize);
    for (int i = 1; i <= poolSize; i++) {
      pool.add(i);
    }
  }

  @Override
  public void shuffle() {
    Collections.shuffle(pool, getRng());
    shuffled = true;
    position = 0;
  }

  @Override
  public Integer[] draw(int numItems) {
    Integer[] draw = new Integer[numItems];
    for (int i = 0; i < numItems; i++) {
      draw[i] = draw();
    }
    return draw;
  }
  
  public Integer draw() {
    if (!shuffled) {
      shuffle();
    }
    return pool.get(position++);
  }

}
