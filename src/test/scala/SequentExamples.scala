object SequentExamples {
  val A: Prop = SL("A")
  val B: Prop = SL("B")
  val C: Prop = SL("C")

  val preAndISequent1: Sequent = Sequent(Seq(), And(A, B))
  val preAndISequent2: Sequent = Sequent(Seq(C), And(A, B))
  val preAndISequent3: Sequent = Sequent(Seq(A, C), And(A, B))
  val postAndISequent1_1: Sequent = Sequent(Seq(), A)
  val postAndISequent1_2: Sequent = Sequent(Seq(), B)
  val postAndISequent2_1: Sequent = Sequent(Seq(C), A)
  val postAndISequent2_2: Sequent = Sequent(Seq(C), B)
  val postAndISequent3_1: Sequent = Sequent(Seq(A, C), A)
  val postAndISequent3_2: Sequent = Sequent(Seq(A, C), B)

  val preAndESequent1: Sequent = Sequent(Seq(And(B, A)), C)
  val preAndESequent2: Sequent = Sequent(Seq(And(B, A), C), A)
  val preAndESequent3: Sequent = Sequent(Seq(C, And(B, A)), A)
  val postAndESequent1: Sequent = Sequent(Seq(B, A), C)
  val postAndESequent2: Sequent = Sequent(Seq(B, A, C), A)
  val postAndESequent3: Sequent = Sequent(Seq(B, A, C), A)

  val preOrISequent1: Sequent = Sequent(Seq(), Or(A, B))
  val preOrISequent2: Sequent = Sequent(Seq(A), Or(A, B))
  val preOrISequent3: Sequent = Sequent(Seq(B, C), Or(A, B))
  val postOrILeftSequent1: Sequent = Sequent(Seq(), A)
  val postOrILeftSequent2: Sequent = Sequent(Seq(A), A)
  val postOrILeftSequent3: Sequent = Sequent(Seq(B, C), A)
  val postOrIRightSequent1: Sequent = Sequent(Seq(), B)
  val postOrIRightSequent2: Sequent = Sequent(Seq(A), B)
  val postOrIRightSequent3: Sequent = Sequent(Seq(B, C), B)

  val preOrESequent1: Sequent = Sequent(Seq(Or(B, A)), A)
  val preOrESequent2: Sequent = Sequent(Seq(Or(B, A), C), B)
  val preOrESequent3: Sequent = Sequent(Seq(C, Or(B, A)), And(A, B))
  val postOrESequent1_1: Sequent = Sequent(Seq(B), A)
  val postOrESequent1_2: Sequent = Sequent(Seq(A), A)
  val postOrESequent2_1: Sequent = Sequent(Seq(B, C), B)
  val postOrESequent2_2: Sequent = Sequent(Seq(A, C), B)
  val postOrESequent3_1: Sequent = Sequent(Seq(B, C), And(A, B))
  val postOrESequent3_2: Sequent = Sequent(Seq(A, C), And(A, B))

  val preImpISequent1: Sequent = Sequent(Seq(), Imp(A, B))
  val preImpISequent2: Sequent = Sequent(Seq(C), Imp(A, B))
  val preImpISequent3: Sequent = Sequent(Seq(Not(C), B), Imp(A, B))
  val postImpISequent1: Sequent = Sequent(Seq(A), B)
  val postImpISequent2: Sequent = Sequent(Seq(A, C), B)
  val postImpISequent3: Sequent = Sequent(Seq(A, Not(C), B), B)

  val preImpESequent1: Sequent = Sequent(Seq(Imp(A, B)), Not(C))
  val preImpESequent2: Sequent = Sequent(Seq(Imp(A, B), C), Not(C))
  val preImpESequent3: Sequent = Sequent(Seq(C, Imp(A, B)), Not(C))
  val postImpESequent1_1: Sequent = Sequent(Seq(Imp(A, B)), A)
  val postImpESequent1_2: Sequent = Sequent(Seq(B), Not(C))
  val postImpESequent2_1: Sequent = Sequent(Seq(Imp(A, B), C), A)
  val postImpESequent2_2: Sequent = Sequent(Seq(B, C), Not(C))
  val postImpESequent3_1: Sequent = Sequent(Seq(C, Imp(A, B)), A)
  val postImpESequent3_2: Sequent = Sequent(Seq(B, C), Not(C))

  val preNotISequent1: Sequent = Sequent(Seq(), Not(A))
  val preNotISequent2: Sequent = Sequent(Seq(C), Not(A))
  val preNotISequent3: Sequent = Sequent(Seq(B, A, C), Not(A))
  val postNotISequent1: Sequent = Sequent(Seq(A), Absurd)
  val postNotISequent2: Sequent = Sequent(Seq(A, C), Absurd)
  val postNotISequent3: Sequent = Sequent(Seq(A, B, A, C), Absurd)

  val preNotESequent1: Sequent = Sequent(Seq(Not(A)), C)
  val preNotESequent2: Sequent = Sequent(Seq(Not(A), B), C)
  val preNotESequent3: Sequent = Sequent(Seq(B, Not(A)), C)
  val postNotESequent1_1: Sequent = Sequent(Seq(Not(A)), A)
  val postNotESequent1_2: Sequent = Sequent(Seq(Absurd), C)
  val postNotESequent2_1: Sequent = Sequent(Seq(Not(A), B), A)
  val postNotESequent2_2: Sequent = Sequent(Seq(Absurd, B), C)
  val postNotESequent3_1: Sequent = Sequent(Seq(B, Not(A)), A)
  val postNotESequent3_2: Sequent = Sequent(Seq(Absurd, B), C)
}
