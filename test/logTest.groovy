import com.lesfurets.jenkins.unit.BasePipelineTest
import org.junit.Before
import org.junit.Test

class logTest extends BasePipelineTest {

  def log

  @Before
  void setUp() {
    super.setUp()
    log = loadScript("vars/log.groovy")
  }

  @Test
  void logColorTest() {
    log.red   ("It is red."   )
    log.green ("It is green." )
    log.yellow("It is yellow.")
    log.blue  ("It is blue."  )
    log.violet("It is violet.")
    log.cyan  ("It is cyan."  )
    log.white ("It is white." )
  }

}
