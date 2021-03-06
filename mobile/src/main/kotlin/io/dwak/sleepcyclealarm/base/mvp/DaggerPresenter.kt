package io.dwak.sleepcyclealarm.base.mvp

import io.dwak.sleepcyclealarm.dagger.component.InteractorComponent

public interface DaggerPresenter {
    val interactorComponent : InteractorComponent
    fun inject()
}