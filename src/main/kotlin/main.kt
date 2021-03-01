import com.google.gson.Gson
import ru.sagutdinov.Post
import ru.sagutdinov.PostType
import java.io.File
import java.util.*

fun main() {
    val fileName = "posts.json"
    File(fileName).writeText(Gson().toJson(list()))
}

fun list() = listOf(
    Post(
        "netology",
        2,
        "First post in our network!",
        Date(),
        PostType.Post,
        0,
        false,
        8,
        2,
        null,
        null,
        null
    ),
    Post(
        "etology",
        2,
        "Second post in our network!",
        Date(),
        PostType.Event,
        0,
        false,
        8,
        2,
        Pair(60.0, 85.0),
        null,
        null
    ),
    Post(
        "tology",
        2,
        "Third post in our network!",
        Date(),
        PostType.Video,
        0,
        false,
        8,
        2,
        null,
        "https://www.youtube.com/watch?v=lO5_E9aObE0",
        null
    ),
    Post(
        "logy",
        2,
        "Fourth post in our network!",
        Date(),
        PostType.Advertising,
        0,
        false,
        8,
        2,
        null,
        "https://l.netology.ru/marketing_director_guide?utm_source=vk&utm_medium=smm&utm_campaign=bim_md_oz_vk_smm_guide&utm_content=12052020",
        1
    )
)