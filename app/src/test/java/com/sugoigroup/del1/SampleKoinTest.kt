package com.sugoigroup.del1

import com.sugoigroup.del1.domain.usecase.DashboardUsecase
import com.sugoigroup.del1.ui.dashboard.DashboardViewModel
import junit.framework.TestCase.assertNotNull
import org.junit.Rule
import org.junit.Test
import org.koin.android.viewmodel.ext.android.viewModel
import org.koin.core.inject
import org.koin.test.KoinTest
import org.koin.test.KoinTestRule

class SampleKoinTest : KoinTest {

    private val usecase: DashboardUsecase by inject<DashboardUsecase>()

    @get:Rule
    val koinTestRule = KoinTestRule.create {
        modules(AppModules().modules)
    }


    @Test
    fun sampleTest() {
        assert("Say Hello Koin" == usecase.changeText())
    }
}