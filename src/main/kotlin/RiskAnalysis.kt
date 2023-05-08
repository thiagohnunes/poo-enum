import java.time.LocalDate

interface RiskAnalysis {
    fun execute(transaction: Transaction): RiskAnalysisResult
}

class MinimalRiskAnalysis : RiskAnalysis {
    override fun execute(transaction: Transaction): RiskAnalysisResult {
        val analysisResult = (transaction.value < 100)
        return RiskAnalysisResult(approved = analysisResult)
    }
}

class FullRiskAnalysis : RiskAnalysis {
    override fun execute(transaction: Transaction): RiskAnalysisResult {
        val analysisResult = ((transaction.value < 90) && transaction.date.isEqual(LocalDate.now()))
        return RiskAnalysisResult(approved = analysisResult)
    }
}
