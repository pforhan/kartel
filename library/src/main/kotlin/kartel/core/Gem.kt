package kartel.core

/** Matchable unit of gameplay */
class Gem<T>(
  val value: T,
)

/**
 * Produces gems.
 */
interface Mineshaft<T> {
  fun nextGem(): Gem<T>
}