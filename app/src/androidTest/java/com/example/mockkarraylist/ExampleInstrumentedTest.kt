package com.example.mockkarraylist

import android.support.test.runner.AndroidJUnit4
import io.mockk.every
import io.mockk.mockk
import org.junit.Test
import org.junit.runner.RunWith


@RunWith(AndroidJUnit4::class)
class ExampleInstrumentedTest {
    @Test
    fun mock_array_list() {
        val mock = mockk<ArrayList<String>>()
    }

    @Test
    fun mock_object_with_array_list() {
        val mock = mockk<Class_With_ArrayList>()

        every { mock.myArrayList } returns ArrayList()
    }
}
