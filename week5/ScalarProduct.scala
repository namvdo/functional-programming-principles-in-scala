object ScalarProduct {
    def scalarProduct(a: List[Int], b: List[Int]) = {
        (for((x, y) <- a zip b) yield x * y).sum
    }
}