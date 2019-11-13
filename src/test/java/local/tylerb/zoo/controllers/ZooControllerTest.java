package local.tylerb.zoo.controllers;

import local.tylerb.zoo.model.Zoo;
import local.tylerb.zoo.services.Service;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@WebMvcTest(value = ZooController.class)
public class ZooControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private Service service;

    //private List<Zoo>()

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void getAll() {
    }

    @Test
    public void getZooById() {
    }

    @Test
    public void getStringByName() {
    }

    @Test
    public void addZoo() {
    }

    @Test
    public void updateZoo() {
    }

    @Test
    public void deleteZoo() {
    }

    @Test
    public void deleteZooAnimals() {
    }

    @Test
    public void addZooAnimals() {
    }
}