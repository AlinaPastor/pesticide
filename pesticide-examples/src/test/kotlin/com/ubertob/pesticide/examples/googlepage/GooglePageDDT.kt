package com.ubertob.pesticide.examples.googlepage

import com.ubertob.pesticide.DDT
import com.ubertob.pesticide.DomainDrivenTest

class GooglePageDDT : DomainDrivenTest<GooglePageInterpreter>(
    setOf(
        GooglePageInterpreter()
    )
) {

    val googleUser by NamedActor(::GoogleUser)

    @DDT
    fun `user can search for a word`() = ddtScenario {

        withoutSetting atRise play(

            googleUser.`search for`("pesticide github kotlin"),

            googleUser.`can see among results`("uberto")

        )
    }
}