package cupid.core

class Gem(
  // TODO a value.  Parameterized?
)

/**
 * Grid of gems.
 * @param gravity Direction that gems come onto the board; they will enter
 *   on the opposite side of the board. That is, if gravity is
 *   DOWN then gems will enter the top of the board
 */
class Board(
  val width: Int,
  val height: Int,
  val gravity: Direction,
  val matcher: Matcher,
  val mine: Mineshaft,
) : Iterable<Gem> {

  // TODO vals for the board storage
  // TODO populate initial board
  // TODO need to be able to make predefined boards too
  fun swap(
    x: Int,
    y: Int,
    direction: Direction,
  ) {
    // can be implemented with a commit call
  }

  fun commit(change: (editor: BoardEditor) -> Unit) {
  }

  // TODO pause/resume methods so you can use multiple sets?
  // TODO or maybe have a changeset that you commit all at once?
}

interface Matcher {
  fun hasMatches(board: Board): Boolean
  fun makeMatches(change: (editor: BoardEditor) -> Unit): Unit
}

/**
 * Editor that allows multiple changes to the board before
 * commiting/checking for matches.
 */
interface BoardEditor {
  /**
   * Place a gem in the board.
   */
  fun set(
    x: Int,
    y: Int,
    gem: Gem,
  )

  /**
   * Delete a gem. Based on board gravity the space will be filled
   * by an adjacent gem or a new one.
   */
  fun clear(
    x: Int,
    y: Int
  )

  /**
   * Make all changes -- fill empty spaces, check for matches.
   */
  fun commit()
}

/**
 * Direction of an action, like a swap.
 * TODO is this needed?  Feels trashy.
 */
enum class Direction {
  UP,
  DOWN,
  LEFT,
  RIGHT
}

/**
 * Produces gems.
 * TODO: need to either go all in on gems, or on cupid, or something. Names are all a mix
 * and not related
 */
interface Mineshaft {
  fun nextGem(): Gem
}