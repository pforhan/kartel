/**
 * Editor that allows multiple changes to the field before commiting/checking 
 * for matches. Only the last change to a given gem in a field will actually 
 * be used. No matching or gem creation will be performed while a GemFieldEditor
 * is active.
 */
interface GemFieldEditor<T> {
  /** 
   * Marks a gem as matched and flags it for removal. Based on field gravity 
   * the space will be filled by an adjacent gem or a new one.
   */
  fun match(
    x: Int,
    y: Int,
    matchAs: Gem<T>? = null
  )

  /**
   * Place a gem in the field, overwriting the previous gem.
   */
  fun set(
    x: Int,
    y: Int,
    gem: Gem<T>,
  )

  /**
   * Delete a gem. Based on field gravity the space will be filled
   * by an adjacent gem or a new one.
   * Returns the gem removed or null if it has already been removed.
   */
  fun remove(
    x: Int,
    y: Int
  ): T?
}
