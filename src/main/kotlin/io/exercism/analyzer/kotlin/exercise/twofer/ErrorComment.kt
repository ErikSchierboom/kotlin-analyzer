package io.exercism.analyzer.kotlin.exercise.twofer

import io.exercism.analyzer.kotlin.analysis.AnalysisStatus

enum class ErrorComment(val status: AnalysisStatus, val message: String? = null) {
    //Disapprove
    NO_FUNCTION(AnalysisStatus.disapprove_with_comment, "kotlin.general.no_func"),
    WRONG_PARAM(AnalysisStatus.disapprove_with_comment, "kotlin.two_fer.wrong_param"),
    NO_DEFAULT_VALUE(AnalysisStatus.disapprove_with_comment, "kotlin.two_fer.no_default_value"),
    PARAM_NULLABLE(AnalysisStatus.disapprove_with_comment, "kotlin.two_fer.use_nullable_type"),
    WRONG_DEFAULT_TYPE(AnalysisStatus.disapprove_with_comment, "kotlin.two_fer.wrong_default_type"),
    WRONG_DEFAULT_VALUE(AnalysisStatus.disapprove_with_comment, "kotlin.two_fer.wrong_default_value"),
    USE_CONDITION(AnalysisStatus.disapprove_with_comment, "kotlin.two_fer.use_condition"),
    USE_LOOP(AnalysisStatus.disapprove_with_comment, "kotlin.two_fer.use_loop"),
    TOO_MANY_TWOFER_FUNCTION(AnalysisStatus.disapprove_with_comment, "kotlin.two_fer.too_many_function"),
    NO_NEED_RETURN(AnalysisStatus.disapprove_with_comment, "kotlin.two_fer.no_need_return"),
    NO_STRING_TEMPLATE(AnalysisStatus.disapprove_with_comment, "kotlin.two_fer.no_string_template"),
    //Approve
    NO_INFERENCE_TYPE(AnalysisStatus.approve_with_comment, "kotlin.two_fer.no_inferrence_type"),
    //Refer
    REFER_MENTOR(AnalysisStatus.refer_to_mentor)
}