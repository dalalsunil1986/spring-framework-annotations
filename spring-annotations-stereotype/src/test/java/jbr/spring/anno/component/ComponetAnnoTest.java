package jbr.spring.anno.component;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:stereotype-anno-beans.xml" })
public class ComponetAnnoTest {

  @Autowired
  public Table table;

  @Test
  public void test() throws Exception {
    System.out.println(table.getName());
  }
}
