package nextstep.signup.ui.component

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import nextstep.signup.ui.theme.Blue50
import nextstep.signup.ui.theme.Gray20
import nextstep.signup.ui.theme.Gray50

@Composable
fun SubmitButton(onClick: () -> Unit, text: String) {
    Button(
        content = {
            Text(text, fontSize = 14.sp)
        },
        shape = RoundedCornerShape(100.dp),
        onClick = onClick,
        contentPadding = PaddingValues(15.dp),
        modifier = Modifier.fillMaxWidth(),
        colors = ButtonColors(
            containerColor = Blue50,
            contentColor = Color.White,
            disabledContentColor = Gray20,
            disabledContainerColor = Gray50
        )
    )
}

@Preview(
    showBackground = true,
    backgroundColor = 0xFFFFFFFF
)
@Composable
private fun SubmitButtonPreview() {
    SubmitButton(
        onClick = {},
        text = "테스트"
    )
}
