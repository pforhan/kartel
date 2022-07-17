package cupid.core

/** 
 * Grid of gems. 
 * @param gravity Direction that gems come onto the board; they will enter
 *   on the opposite side of the board. That is, if gravity is
 *   DOWN then gems will enter the top of the board
 */
 */
class Board(
  val width: Int,
  val height: Int,
  val gravity: Direction,
  val matcher: Matcher,
  val mine: Mineshaft
) {

  // TODO vals for the board storage
  // TODO populate initial board
  // TODO need to be able to make predefined boards too
  fun swap(x: Int, y: Int, direction: Direction) {

  }
}

/** 
 * Direction that gems come onto the board; they will enter
 * on the opposite side of the board. That is, if gravity is
 * DOWN then gems will enter the top of the board
 */
enum class Direction {
  UP, DOWN, LEFT, RIGHT
}

interface Mineshaft {
  fun nextGem(): Gem
}