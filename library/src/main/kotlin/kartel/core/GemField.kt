package kartel.core

/**
 * Grid of gems.
 * @param width
 * @param height
 * @param gravity Direction that gems come onto the field; they will enter
 *   on the opposite side of the field. That is, if gravity is
 *   DOWN then gems will enter the top of the field
 * @param matcher determines if matches are present
 * @param mine producer of more gems
 */
class GemField<T>(
  val width: Int,
  val height: Int,
  val gravity: Direction,
  val matcher: MatchFinder<T>,
  val mine: Mineshaft<T>,
) : Iterable<Gem<T>> {

  val gemRows = Array(height) {Array(width)}
  val twoDArray = Array(2) { Array<Int>(2) { 0 } }
  
  // TODO need to be able to make predefined field too

  fun swap(
    x: Int,
    y: Int,
    direction: Direction,
  ) : Boolean {
    // can be implemented with a check and a commit call
    // TODO need to be able to see if a proposed change would result in a match
  }

  fun commit(change: ActionSet<T>) {
  }
}


/** Direction of an action, like a swap. */
enum class Direction {
  UP,
  DOWN,
  LEFT,
  RIGHT
}

/**
 * Determines if gems are matching. This class can allow gems with
 * different values to match each other.
 */
interface MatchFinder<T> {
  /** true if there are any matches available. TODO is this needed? may be best to scan and exec in one go. */
  fun hasMatches(field: GemField<T>): Boolean

  fun allMatches(): ActionSet<T>
}

/** Can perform multiple changes on a board before searching for matches. */
interface ActionSet<T> {
  fun execute(editor: GemFieldEditor<T>): Unit
}
