package riskanalysis

import RiskAnalysisResult
import Transaction
import java.time.LocalDate

interface RiskAnalysis {
    fun execute(transaction: Transaction): RiskAnalysisResult
}




