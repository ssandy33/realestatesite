USE [customer]
GO

/****** Object:  StoredProcedure [dbo].[ovs_XssSearchStringLoad]    Script Date: 01/20/2014 08:55:56 ******/
SET ANSI_NULLS ON
GO

SET QUOTED_IDENTIFIER ON
GO


CREATE proc [dbo].[ovs_XssSearchStringLoad]

as

select	recno, search_string
from	xss_search_strings (nolock)

GO