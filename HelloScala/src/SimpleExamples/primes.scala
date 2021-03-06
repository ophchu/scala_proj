package SimpleExamples

/**
 * @author ophirc
 * @version 1.0.0
 * @since 3/18/13, 18:01
 */
/** Print prime numbers less than 100, very inefficiently */
object primes extends Application {
  def isPrime(n: Int) = (2 until n) forall (n % _ != 0)
  for (i <- 1 to 100 if isPrime(i)) println(i)
}

