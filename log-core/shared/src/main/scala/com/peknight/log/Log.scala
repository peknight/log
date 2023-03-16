package com.peknight.log

trait Log:
  def logger: Option[String | Class[_]]
  def level: LogLevel
  def message: String
  def throwable: Option[Throwable]
