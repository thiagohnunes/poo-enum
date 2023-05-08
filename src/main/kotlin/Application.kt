import java.time.LocalDate

fun main() {
    val customerWithFullRiskAnalysis = Customer("James Full", RiskAnalysisType.FULL)
    val customerWithMinimalRiskAnalysis = Customer("Linda Minimal", RiskAnalysisType.MINIMAL)
    val transaction = Transaction(value = 99, date = LocalDate.now())

    val fullRiskAnalysisResult = customerWithFullRiskAnalysis.riskType.instance().execute(transaction)
    val minimalRiskAnalysisResult = customerWithMinimalRiskAnalysis.riskType.instance().execute(transaction)

    println(fullRiskAnalysisResult)
    println(minimalRiskAnalysisResult)
}
