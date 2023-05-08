enum class RiskAnalysisType {
    MINIMAL {
        override fun instance() = MinimalRiskAnalysis()
    },
    FULL {
        override fun instance() = FullRiskAnalysis()
    };

    abstract fun instance(): RiskAnalysis
}
