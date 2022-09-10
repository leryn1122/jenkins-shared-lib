import com.lesfurets.jenkins.unit.BasePipelineTest
import org.junit.Before
import org.junit.Test

class detectionTest extends BasePipelineTest {

  def detection

  @Before
  void setUp() {
    super.setUp()
    detection = loadScript("vars/detection.groovy")
  }

  @Test
  void detectProjectType() {
    detection.detectProjectType()
    printCallStack()
  }

}
