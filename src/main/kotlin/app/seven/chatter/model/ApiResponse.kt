package app.seven.chatter.model

sealed class ApiResponse<T>(
    val success: Boolean,
    open val message: String,
    open val data: T? = null
) {

    data class Success<T>(
        override val message: String,
        override val data: T
    ) : ApiResponse<T>(
        success = true,
        message = message,
        data = data,
    )

    data class Error(override val message: String) : ApiResponse<String>(
        success = false,
        message = "",
    )
}
