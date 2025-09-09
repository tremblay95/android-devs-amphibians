package ca.sneakysquid.learnandroid.amphibians.fake

import ca.sneakysquid.learnandroid.amphibians.model.Amphibian

object FakeDataSource {
    val amphibiansList = listOf(
        Amphibian(
            name = "amph1",
            type = "amph1_type",
            description = "amph1_desc",
            imgSrc = "amph1.url"
        ),
        Amphibian(
            name = "amph2",
            type = "amph2_type",
            description = "amph2_desc",
            imgSrc = "amph2.url"
        ),
        Amphibian(
            name = "amph3",
            type = "amph3_type",
            description = "amph3_desc",
            imgSrc = "amph3.url"
        )
    )
}
