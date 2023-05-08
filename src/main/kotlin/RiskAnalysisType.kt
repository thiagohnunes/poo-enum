import riskanalysis.FullRiskAnalysis
import riskanalysis.MinimalRiskAnalysis
import riskanalysis.RiskAnalysis

enum class RiskAnalysisType {
    MINIMAL {
        override fun instance() = MinimalRiskAnalysis()
    },
    FULL {
        override fun instance() = FullRiskAnalysis()
    };

    abstract fun instance(): RiskAnalysis
}
