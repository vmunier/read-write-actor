package readwriteactor

object Types {
  type Write[S] = S => S
  type WriteRead[S, R] = S => (S, R)
  type Read[S, U] = S => U
}
