package kindSir.models

import org.json4s._

import scala.util.Try

case class MergeRequest(id: Int, projectId: Int, upvotes: Int, downvotes: Int)

object MergeRequest {

  implicit val formats = DefaultFormats

  def parse(json: JValue): Try[MergeRequest] = Try(json.camelizeKeys.extract[MergeRequest])

  def parseList(json: JArray): Try[List[MergeRequest]] = Try(json.camelizeKeys.extract[List[MergeRequest]])
}