/**
 * 
 */
package edu.cnm.deepdive.random;

import java.util.Arrays;

/**
 * @author Sky Link
 *
 */
public class KenoTest {

  /**
   * @param args
   */
  public static void main(String[] args) {
    Keno keno = new Keno();
    Integer[] winners = keno.draw(5);
    Arrays.sort(winners);
    System.out.println(Arrays.toString(winners));
  }

}
